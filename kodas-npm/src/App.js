import logo from './logo.svg';
import vaccineMeme from './images/vaccines.jpg'
import vaccineCenter from './images/vakcinacijosVieta.jpg'
import './App.css';
import Navbar from "./components/Navbar"
import PhoneCard from "./components/PhoneCard"
import axios from 'axios';
import React, {Component} from 'react';



function App() {

  return (
    <div>
      <div>
        <Navbar />
      </div>
      <div className="contacts">
      <PhoneCard 
        img ={vaccineMeme}
        name="Vakcinos Su Akcija"
      />
      <PhoneCard 
        img={vaccineCenter}
        name="Pfizer/Moderna vakcinacijos centras"
      />
      </div>
    </div>
  );
}

export default App;
