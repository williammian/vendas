import NextAuth from 'next-auth'
import Providers from 'next-auth/providers'

export default NextAuth({
    providers: [
        Providers.GitHub({
            clientId: 'Iv23lizC73dFQ4eSxF0V',
            clientSecret: '78962a176e508344a33afa879478ff9a4b1bd2cb'
        }),
        Providers.Auth0({
            clientId: 'R0z4WoD0A1ODq6Mq3SHBclyUvhxwqK73',
            clientSecret: '0QYBUb1LhTJ4avUG-7MDokuXyHvngaENd7_DrTCxs4T3f6q_95ojDBSVbp62hPzl',
            domain: 'dev-hthvzplcdns4re68.us.auth0.com'
        })
    ]
})