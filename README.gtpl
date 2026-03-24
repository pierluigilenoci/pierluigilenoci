### Pierluigi Lenoci

Father and DevOps Engineer in Berlin, Germany

![Pierluigi's GitHub stats](https://github-readme-stats.vercel.app/api?username=pierluigilenoci&show=reviews,discussions_started,discussions_answered,prs_merged,prs_merged_percentage&show_icons=true&theme=transparent&cache_seconds=86400)

[`📫 How to reach me`](https://about.me/pierluigi.lenoci)

### 👷 Check out what I'm currently working on
{{ range recentContributions 10 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

<!---
### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}
-->

### 🔨 My recent Pull Requests
{{ range recentPullRequests 10 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}

### 🔭 Latest releases I've contributed to
{{ range recentReleases 10 }}
- [{{ .Name }}]({{ .URL }}) [`{{ .LastRelease.TagName }}`]({{ .LastRelease.URL }}) - {{.Description}}
{{- end }}

### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### 💖 Recent followers
{{ range followers 5 }}
- [**@{{ .Login }}**]({{ .URL }})
{{- end }}
