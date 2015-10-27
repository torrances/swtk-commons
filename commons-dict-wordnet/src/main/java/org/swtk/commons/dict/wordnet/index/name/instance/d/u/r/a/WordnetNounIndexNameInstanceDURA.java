package org.swtk.commons.dict.wordnet.index.name.instance.d.u.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDURA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05490181\"]}");
	add("{\"term\":\"durability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05060839\"]}");
	add("{\"term\":\"durables\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03262580\"]}");
	add("{\"term\":\"durabolin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14772514\"]}");
	add("{\"term\":\"duralumin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14863492\"]}");
	add("{\"term\":\"duramen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13118511\"]}");
	add("{\"term\":\"durance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14023590\"]}");
	add("{\"term\":\"durango\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08761062\"]}");
	add("{\"term\":\"durant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10965691\"]}");
	add("{\"term\":\"durante\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10965817\"]}");
	add("{\"term\":\"duration\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05058400\", \"15158440\", \"15158573\"]}");
	add("{\"term\":\"durative\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13827391\"]}");
	add("{\"term\":\"durazzo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08723065\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }