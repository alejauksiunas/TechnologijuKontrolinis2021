import React from "react"

export default function PhoneCard(props) {
    return (
        <div className="contact-card">
            <img src={props.img} alt="..."/>
            {/* <img src={require("./home/priyanka/Finalproject/src/components/3.jpg")} alt="cannot display"/> */}
            <h3>{props.name}</h3>
        </div>
    )
}