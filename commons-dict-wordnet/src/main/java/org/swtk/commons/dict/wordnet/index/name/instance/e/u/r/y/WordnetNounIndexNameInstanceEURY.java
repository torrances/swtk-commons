package org.swtk.commons.dict.wordnet.index.name.instance.e.u.r.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEURY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"euryale\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02321089\", \"09521317\"]}");
	add("{\"term\":\"euryalida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02320635\"]}");
	add("{\"term\":\"eurydice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09594759\"]}");
	add("{\"term\":\"eurylaimi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01548864\"]}");
	add("{\"term\":\"eurylaimidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01548989\"]}");
	add("{\"term\":\"eurypterid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01791220\"]}");
	add("{\"term\":\"eurypterida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01791061\"]}");
	add("{\"term\":\"eurythmics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00430698\"]}");
	add("{\"term\":\"eurythmy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00430698\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }