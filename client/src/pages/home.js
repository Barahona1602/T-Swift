import React, { useState, useRef } from 'react';
import { Button } from 'primereact/button';
import { PostMethod } from '../api/http';
import MonacoEditor from 'react-monaco-editor';

const interpreterAPI = process.env.REACT_APP_API_URL_INTERPRETER;

const Home = () => {
    const [codeText, setCodeText] = useState('');
    const [consoleText, setConsoleText] = useState('');
    const [html, setHtml] = useState('');
    const [htmlErr, setHtmlErr] = useState('');
    const [showHtmlErr, setShowHtmlErr] = useState(false);
    const [showHtml, setShowHtml] = useState(false);
    const uploadInputRef = useRef(null);

    const CompileInterpreter = async () => {
        const resp = await PostMethod(interpreterAPI + 'Interpreter', { Content: codeText });
        const newHtml = resp?.Tabla;
        await setHtml(newHtml);
        const newHtmlErr = resp?.TablaErr;
        await setHtmlErr(newHtmlErr);
        await setConsoleText(resp?.Output);
    };

    const handleFileUpload = () => {
        uploadInputRef.current.click();
    };

    const handleFileInputChange = e => {
        const file = e.target.files[0];
        const reader = new FileReader();

        reader.onload = (event) => {
            setCodeText(event.target.result);
        };

        if (file) {
            reader.readAsText(file);
        }
    };


    const toggleHtmlDisplay = () => {
        setShowHtml(!showHtml);
        setShowHtmlErr(false); // Desactivar la visibilidad de la tabla de errores
    };
    
    const toggleHtmlErrDisplay = () => {
        setShowHtmlErr(!showHtmlErr);
        setShowHtml(false); // Desactivar la visibilidad de la tabla de símbolos
    };
    

    return (
        <div style={{ display: 'flex', flexDirection: 'column', alignItems: 'center'}}>
            <h1>T-Swift</h1>
            
            <div style={{ display: 'flex', justifyContent: 'left', alignItems: 'left', width: '100%', marginLeft: '0%' }}>
                <Button label="UPLOAD" className="p-button-success" style={{ marginRight: '1%' }} onClick={handleFileUpload} />
                <input ref={uploadInputRef} type="file" accept=".swift" onChange={handleFileInputChange} style={{ display: 'none' }} />
            </div>
            <div style={{ display: 'flex', justifyContent: 'left', alignItems: 'left', width: '100%', paddingTop: '1%' }}>
                <div style={{ width: '40%', height: '60%', marginRight: '10%' }}>
                    <label>Input Code</label>
                    <MonacoEditor
                        height={'600px'}
                        width={'800px'}
                        language="swift"
                        theme="vs-dark"
                        value={codeText}
                        onChange={setCodeText}
                        options={{
                            fontFamily: "'Fira Code', monospace",
                            fontSize: 14,
                            wordWrap: "on",
                            colorDecorators: true,
                            lineNumbers: "on",
                            automaticLayout: true,
                            renderLineHighlight: "all",
                            selectionHighlight: true,
                            minimap: {
                                enabled: true
                            },
                            scrollbar: {
                                verticalScrollbarSize: 10,
                                horizontalScrollbarSize: 10
                            },
                            tokenColorCustomizations: {
                                variables: "#FF5733",
                                functions: "#00BFFF",
                                keywords: "#FFD700"
                            }
                        }}
                    />

                </div>
        
                <div style={{ width: '40%', height: '60%', marginLeft: '10%' }}>
                    <label>Console Output</label>
                    <MonacoEditor
                        height={'600px'}
                        width={'600px'}
                        language="swift"
                        theme="vs-dark"
                        value={consoleText}
                        options={{ readOnly: true, scrollBeyondLastLine: false }}

                    />
                </div>
            </div>
            <div style={{ display: 'flex', justifyContent: 'left', alignItems: 'left', width: '100%', marginLeft: '0%', paddingTop: '1%' }}>
                <Button label="RUN >>>" className="p-button-success" onClick={CompileInterpreter} style={{ marginBottom: '1%' }} />
            </div>
            <div style={{ display: 'flex', justifyContent: 'center', alignItems: 'center', width: '100%' }}>
                <Button label="CST" className="p-button-success" style={{ marginRight: '1%' }} />
                <Button label="ERRORES" className="p-button-success" onClick={toggleHtmlErrDisplay} style={{ marginRight: '1%' }} />
                <Button label="TABLA DE SIMBOLOS" className="p-button-success" onClick={toggleHtmlDisplay} />
            </div>
            {/* Insertar el contenido HTML debajo de los botones solo si showHtml es true */}
            {showHtml && <div dangerouslySetInnerHTML={{ __html: html }} />}
            {showHtmlErr && <div dangerouslySetInnerHTML={{ __html: htmlErr }} />}
        </div>
    );
};

export default Home;
