import NextAuth from 'next-auth'
import Providers from 'next-auth/providers'

export default NextAuth({
    providers: [
        Providers.GitHub({
            clientId: 'xxx',
            clientSecret: 'xxx'
        }),
        Providers.Auth0({
            clientId: 'yyy',
            clientSecret: 'yyy',
            domain: 'yyy'
        })
    ]
})