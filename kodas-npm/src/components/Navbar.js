import React from "react"

export default function Navbar() {
    function handleClickHome(e){
        e.preventDefault();
        alert('You clicked home')
    }
    function handleClickAdmin(e){
        e.preventDefault();
        alert('You clicked admin')
    }

    function handleClickBasket(e){
        e.preventDefault();
        alert('You clicked register')
    }
    
    return (
        <nav>
            <button className="nav--button" type="submit" onClick={handleClickHome}>Home</button>
            <button className="nav--button" type="submit" onClick={handleClickAdmin}>Admin</button>
            <input className="nav--search" type="search" placeholder="Search..." ></input>
            <h3 className="nav--logo_text">React Vakcinacijos Centras</h3>
            <button className="nav--button"type="submit" onClick={handleClickBasket}>Register</button>
        </nav>
    )
}