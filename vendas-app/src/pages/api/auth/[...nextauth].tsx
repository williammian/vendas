import NextAuth from 'next-auth'
import Providers from 'next-auth/providers'

export default NextAuth({
    providers: [
        Providers.GitHub({
            clientId: process.env.NEXT_PUBLIC_GITHUB_PROVIDER_CLIENTID,
            clientSecret: process.env.NEXT_PUBLIC_GITHUB_PROVIDER_CLIENTSECRET
        }),
        Providers.Auth0({
            clientId: process.env.NEXT_PUBLIC_AUTH0_PROVIDER_CLIENTID,
            clientSecret: process.env.NEXT_PUBLIC_AUTH0_PROVIDER_CLIENTSECRET,
            domain: process.env.NEXT_PUBLIC_AUTH0_PROVIDER_DOMAIN,
        })
    ]
})