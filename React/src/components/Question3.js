// import React, { Component } from 'react'
// import Pe from './person'

// class Question3 extends Component {

//     constructor(props) {
//         super(props);

//         this.state = {
//             uname: '',
//             job: '',
//             id: 0,
//             dd : [
//                 {
//                     id: 1,
//                     name: "Mani",
//                     job: "developer1"
//                 },
//                 {
//                     id: 2,
//                     name: "uma",
//                     job: "developer2"
//                 },
//                 {
//                     id: 3,
//                     name: "vijay",
//                     job: "developer3"
//                 },
//                 {
//                     id: 4,
//                     name: "sai",
//                     job: "developer4"
//                 }
//             ]
//         }
//     }

//     handleChange = (event) => {
//         this.setState({ uname: event.target.value });
//     }

//     handleChange1 = (event) => {
//         this.setState({ job: event.target.value });
//     }

//     handleChange2 = (event) => {
//         this.setState({ id: event.target.value });
//     }

//     handleSubmit = (event) => {
//         alert(this.state.uname + "    " + this.state.job);
//       //  this.setState({dd.push({ id: this.state.id, name: this.state.uname, job: this.state.job })})
//         event.preventDefault();
//     }

//     render() {
//         const { uname, job, id ,dd} = this.state

//         const aa = dd.map(x => (<Pe key={x.id} p={x} />))
//         const mystyle = {
//             width: "70%"
//         }
//         return (
//             <div>
//                 <form onSubmit={this.handleSubmit}>
//                     <div>
//                         <label>Id</label>
//                         <input type='text' value={id} onChange={this.handleChange2} />
//                     </div>

//                     <div>
//                         <label>Name</label>
//                         <input type='text' value={uname} onChange={this.handleChange} />
//                     </div>
//                     <div>
//                         <label>Job</label>
//                         <input type='text' value={job} onChange={this.handleChange1} />
//                     </div>

//                     <input type="submit" value="Submit" />
//                 </form>
//                 <table style={mystyle}>
//                     <tr>
//                         <th>Name</th>
//                         <th>Job</th>
//                     </tr>
//                     {aa}
//                 </table>
//             </div>
//         );
//     }
// }

// export default Question3
import React, { useState } from 'react'
import Pe from './person'

const dd = [
    {
        id: 1,
        name: "Mani",
        job: "developer1"
    },
    {
        id: 2,
        name: "uma",
        job: "developer2"
    },
    {
        id: 3,
        name: "vijay",
        job: "developer3"
    },
    {
        id: 4,
        name: "sai",
        job: "developer4"
    }
]



function Question3() {

   // const [l,setL]= useState(dd);
    const [uname, setName] = useState("name");
    const [ujob, setJob] = useState('job');
    const [uid, setId] = useState(0);



    const aa = dd.map(x => (<Pe key={x.id} p={x} />))
    const mystyle = {
        width: "70%"
    }

    const handleSubmit = (event) => {
        alert(uname + "    " + ujob);
        //  this.setState({dd.push({ id: this.state.id, name: this.state.uname, job: this.state.job })})
        const l={
            id:uid,
            name:uname,
            job:ujob
        }
        dd.push(l)
        console.log(l)
        console.log(dd)
        //const nl= l.concat({id:id,name:uname,job:job})
        //setL(nl)
        event.preventDefault();
    }
    return (
        <div>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>Id</label>
                    <input type='number' value={uid} onChange={e => setId(e.target.value)} />
                </div>

                <div>
                    <label>Name</label>
                    <input type='text' value={uname} onChange={e => setName(e.target.value)} />
                </div>
                <div>
                    <label>Job</label>
                    <input type='text' value={ujob} onChange={e => setJob(e.target.value)} />
                </div>

                <input type="submit" value="Submit" />
            </form>
            <table style={mystyle}>
                <tr>
                    <th>Name</th>
                    <th>Job</th>
                </tr>
                {aa}
            </table>

        </div>
    )
}

export default Question3
