import React, {useEffect} from 'react';
import './App.css';
import {TaskModel} from "./models/task.model";
import TaskCard from "./components/task-card";


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
            <div className={"max-w-md mx-auto px-lg-5"}>
                {tasks.map(
                    task =>
                        <TaskCard key={task.id} task={task}/>
                )}
            </div>
        </div>
    );
}

export default App;
