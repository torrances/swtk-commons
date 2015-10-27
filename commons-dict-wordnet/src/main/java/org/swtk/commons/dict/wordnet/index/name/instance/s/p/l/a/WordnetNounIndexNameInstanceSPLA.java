package org.swtk.commons.dict.wordnet.index.name.instance.s.p.l.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPLA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"splash\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00279065\", \"00719000\", \"04689676\", \"13783311\", \"14001613\", \"07409704\"]}");
	add("{\"term\":\"splashboard\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04288513\", \"04561497\"]}");
	add("{\"term\":\"splashdown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00306806\"]}");
	add("{\"term\":\"splasher\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04288513\", \"04288709\"]}");
	add("{\"term\":\"splashiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04825154\"]}");
	add("{\"term\":\"splashing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00279065\", \"00719000\"]}");
	add("{\"term\":\"splat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04288887\", \"07409903\"]}");
	add("{\"term\":\"splatter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13783311\", \"07409414\"]}");
	add("{\"term\":\"splattering\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00719000\", \"07409414\"]}");
	add("{\"term\":\"splay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04289018\"]}");
	add("{\"term\":\"splayfoot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05584052\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }