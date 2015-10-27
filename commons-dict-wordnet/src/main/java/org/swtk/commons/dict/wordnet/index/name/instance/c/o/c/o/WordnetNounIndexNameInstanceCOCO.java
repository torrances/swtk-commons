package org.swtk.commons.dict.wordnet.index.name.instance.c.o.c.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOCO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"coco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12608564\"]}");
	add("{\"term\":\"cocoa\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07771065\", \"07939004\"]}");
	add("{\"term\":\"cocoanut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07788911\"]}");
	add("{\"term\":\"cocobolo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12544355\"]}");
	add("{\"term\":\"coconspirator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09978371\"]}");
	add("{\"term\":\"coconut\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12608564\", \"07788911\", \"07789214\"]}");
	add("{\"term\":\"cocoon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02315396\"]}");
	add("{\"term\":\"cocooning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01204396\"]}");
	add("{\"term\":\"cocopa\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06935356\", \"09672849\"]}");
	add("{\"term\":\"cocopah\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06935356\", \"09672849\"]}");
	add("{\"term\":\"cocos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12608447\"]}");
	add("{\"term\":\"cocoswood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11769742\"]}");
	add("{\"term\":\"cocotte\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03066339\", \"10505025\"]}");
	add("{\"term\":\"cocoyam\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07752789\", \"11807312\"]}");
	add("{\"term\":\"cocozelle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07732394\", \"12180459\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }