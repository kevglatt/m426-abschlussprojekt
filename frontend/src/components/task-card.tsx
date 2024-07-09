import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';
import {TaskModel} from "../models/task.model";

function taskCard(props: { task: TaskModel }) {
    return (
        <Card className="bg-white shadow-md rounded-lg overflow-hidden mb-4">
            <Card.Body className="p-4">
                <Card.Title className={"text-xl font-bold mb-2"}>
                    {props.task.title}
                </Card.Title>
                <Card.Text className={"text-gray-700"}>
                    {props.task.description}
                </Card.Text>
                <Button variant="primary" className={"bg-red-500"}>Löschen</Button>
            </Card.Body>
        </Card>
    );
}

export default taskCard;