FROM node:16.19.0-bullseye-slim AS builder
WORKDIR /frontend
COPY . .
RUN npm ci
RUN npm run build

FROM nginx:latest
COPY --from=builder /frontend/build /usr/share/nginx/html
EXPOSE 80
