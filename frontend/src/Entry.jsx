export default function Entry({input, doubleValue, doubleSquaredValue}) {

    return (
        <div>
            <h2>Most Recent Values</h2>
            <h3>Input (n): {input}</h3>
            <h3>Double (n * 2): {doubleValue}</h3>
            <h3>Double^2 ((n * 2)^2): {doubleSquaredValue}</h3>
        </div>
    )
}