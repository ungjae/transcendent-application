import {useState} from 'react'
import './App.css'
import NewEntryForm from "./NewEntryForm.jsx";
import Entry from "./Entry.jsx";

function App() {

    const[entry, setEntry] = useState()

    const handleNewEntry = (data) => {
        setEntry(data)
    }

    return (
        <div>
            <h1>Double * Double</h1>
            <NewEntryForm onNewEntry={handleNewEntry}/>
            <Entry {...entry} />
        </div>
  )
}

export default App
