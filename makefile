CLIENT 	:= client
SERVER 	:= server
JFLAGS 	:= -g
JCC 	:= javac

all: $(CLIENT) $(SERVER)

$(CLIENT): $(CLIENT).java
	$(JCC) $(JFLAGS) $(CLIENT).java

$(SERVER): $(SERVER).java
	$(JCC) $(JFLAGS) $(SERVER).java

clean:
	$(RM) *.class

zip:
	@zip jtn136-kyle_netid-becca_netid-PA2.zip *.java makefile
