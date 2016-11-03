首先创建bnd osgi workspace,再创建bnd osgi project
bnd很多包都是拖拽的

build：添加依赖包
osgi.annotation
osgi.core
osgi.cmpn

run:
osgi.cmpn						--System Bundle
org.apache.felix.gogo.shell		--Apache Felix Gogo Shell
org.apache.felix.gogo.command	--Apache Felix Gogo Command
org.apache.felix.gogo.runtime	--Apache Felix Gogo Runtime
org.apache.felix.scr			--Apache Felix Declarative Services
点击resolve

就可以看到编译后generated里jar

felix的命令：
lb
inspect capability service 6

