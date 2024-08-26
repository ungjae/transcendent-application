import { useState } from "react";
import axios from "axios";

export default function NewEntryForm({onNewEntry}) {

    const[text, setText] = useState("")
    const[loading, setLoading] = useState(false)
    const[error, setError] = useState(false)

    const handleSubmit = async (e) => {
        e.preventDefault()
        setLoading(true)
        try{
            const result = await axios.post('/api/v1/entries/' + text)
            setError(false)
            onNewEntry(result.data)
        } catch (error) {
            setError(true)
        }
        setText("")
        setLoading(false)
    }

    return (
        <>
            {
                loading ? <h1>Loading...</h1>
                    :
                    <form onSubmit={handleSubmit}>
                        <label htmlFor="text">Let's double * double a number!</label>
                        <br></br>
                        <input type="text" id="text" placeholder="Enter a number" value={text}
                               onChange={e => setText(e.target.value)} required={true}/>
                        <button type="submit">Submit</button>
                    </form>
            }
            {error && <p> Invalid input! Please enter a number!</p>}
        </>
    )
}