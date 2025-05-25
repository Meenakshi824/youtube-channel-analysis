double likes = Double.parseDouble(row[5]);
double dislikes = Double.parseDouble(row[6]);
double comments = Double.parseDouble(row[7]);
double views = Double.parseDouble(row[4]);

double likeRatio = likes / (dislikes + 1);
double viewsPerComment = views / (comments + 1);
