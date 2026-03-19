### Introduction of Kubernetes
1. Kubernetes enables developers to deploy their applications themselves and as often as they want, without requiring any assistance from operations (ops) team.
2. But kubernetes doesn't benefit only developers. It also helps the ops team by automatically monitoring and rescheduling those apps in the event of a hardware failure.
3. The focus for System Administrators shifts from supervising individual apps to mostly supervising and managing kubernetes and the rest of the infrastructure, while kubernetes itself takes care of the apps.

#### Moving from monolithic apps to microservices
1. Monolithic applications consist of components that are all tightly coupled together and have to be developed, deployed and managed as one entity, because they all run as single OS process.
2. Changes to one part of the application require a redeployment of the whole application.
3. Over time the lack of hard boundaries b/w the parts results in the increase of complexity and 