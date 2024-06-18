import React, {useEffect} from 'react';
import './App.css';
import TaskCard from "./components/task-card";
import {PersonModel} from "./models/person.model";


function App() {

    const [persons, setPersons] = React.useState<PersonModel[]>([]);
    useEffect(() => {
        fetch("http://localhost:8080/persons")
            .then(res =>  res.json())
            .then(data => {
                console.log(data);
                setPersons(data)
            });
    },[]);

    return (
      <div className="App">
          <p>hallo</p>
          <TaskCard/>
          {persons.map(
              person => <p key={person.id}>{person.name}</p>
          )}
      </div>
  );
}

export default App;
