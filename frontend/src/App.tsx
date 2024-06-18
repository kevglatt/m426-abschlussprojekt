import React, {useEffect} from 'react';
import './App.css';
import {TaskModel} from "./models/task.model";


function App() {

    const [tasks, setTasks] = React.useState<TaskModel[]>([]);
    useEffect(() => {
        fetch("http://localhost:8080/tasks")
            .then(res => res.json())
            .then(data => {
                console.log(data);
                setTasks(data)
            });
    }, []);

    return (
        <div className="App">
            {tasks.map(
                task =>
                    <p key={task.id}>{task.title}</p>
            )}
        </div>
    );
}

export default App;
