package org.swtk.commons.dict.wordnet.index.name.instance.b.o.o.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBOOT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"boot\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00137149\", \"00423264\", \"02876605\", \"02876762\", \"07543858\", \"03701391\", \"02876113\"]}");
	add("{\"term\":\"bootblack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09886223\"]}");
	add("{\"term\":\"bootboys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08388127\"]}");
	add("{\"term\":\"bootee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02876975\"]}");
	add("{\"term\":\"bootes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09249645\"]}");
	add("{\"term\":\"booth\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02877328\", \"10877136\", \"02877081\", \"02877456\"]}");
	add("{\"term\":\"boothose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02877578\"]}");
	add("{\"term\":\"bootie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02876975\"]}");
	add("{\"term\":\"bootjack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02877684\"]}");
	add("{\"term\":\"bootlace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02877779\"]}");
	add("{\"term\":\"bootleg\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02877884\", \"07918760\"]}");
	add("{\"term\":\"bootlegger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09886328\"]}");
	add("{\"term\":\"bootlegging\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00093667\", \"00093483\"]}");
	add("{\"term\":\"bootlicker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09820054\"]}");
	add("{\"term\":\"bootmaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09886475\"]}");
	add("{\"term\":\"bootstrap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02877992\"]}");
	add("{\"term\":\"booty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13283562\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }