#!/bin/zsh



#Configuration

commit_interval=10
commit_message="readme edit"


do_commit_function() {
  if git status --porcelain | grep .; then
    echo "Change detected, attempthing commit...."
    git add * --force
    git commit -m "$commit_message"
    echo "Git commit successful. Attempthing Push.."
    git push -u origin main 
  else 
    echo "No Commit yet."
  fi
}


while true; do 
  do_commit_function
  sleep "600"
done

