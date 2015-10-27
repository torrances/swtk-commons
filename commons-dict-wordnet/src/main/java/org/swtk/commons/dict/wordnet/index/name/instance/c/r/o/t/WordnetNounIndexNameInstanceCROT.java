package org.swtk.commons.dict.wordnet.index.name.instance.c.r.o.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCROT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"crotal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13012597\"]}");
	add("{\"term\":\"crotalaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12540068\"]}");
	add("{\"term\":\"crotalidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01756362\"]}");
	add("{\"term\":\"crotalus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01757915\"]}");
	add("{\"term\":\"crotaphion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05239551\"]}");
	add("{\"term\":\"crotaphytus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01682135\"]}");
	add("{\"term\":\"crotch\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05521732\", \"05605191\", \"13937280\"]}");
	add("{\"term\":\"crotchet\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03142779\", \"04805073\", \"06884177\", \"13892186\"]}");
	add("{\"term\":\"crotchetiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04649226\"]}");
	add("{\"term\":\"croton\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12943523\", \"12944412\"]}");
	add("{\"term\":\"crotonbug\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02237500\"]}");
	add("{\"term\":\"crotophaga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01826868\"]}");
	add("{\"term\":\"crottal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13012597\"]}");
	add("{\"term\":\"crottle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13012597\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }