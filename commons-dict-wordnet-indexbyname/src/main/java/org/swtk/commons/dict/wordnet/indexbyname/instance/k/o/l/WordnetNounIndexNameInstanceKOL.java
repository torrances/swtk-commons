package org.swtk.commons.dict.wordnet.indexbyname.instance.k.o.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKOL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kol nidre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06468615\"]}");
	add("{\"term\":\"kola\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06997106\", \"12217876\"]}");
	add("{\"term\":\"kola nut\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12217876\", \"12218118\"]}");
	add("{\"term\":\"kola nut tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12217876\"]}");
	add("{\"term\":\"kola peninsula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09033344\"]}");
	add("{\"term\":\"kolam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09694271\"]}");
	add("{\"term\":\"kolami\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06994366\"]}");
	add("{\"term\":\"kolkata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08923604\"]}");
	add("{\"term\":\"kolkhoz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08073820\"]}");
	add("{\"term\":\"kolkhoznik\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10260114\"]}");
	add("{\"term\":\"kolkwitzia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12693258\"]}");
	add("{\"term\":\"kolkwitzia amabilis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12693392\"]}");
	add("{\"term\":\"koln\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08790140\"]}");
	add("{\"term\":\"kolonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08856449\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }