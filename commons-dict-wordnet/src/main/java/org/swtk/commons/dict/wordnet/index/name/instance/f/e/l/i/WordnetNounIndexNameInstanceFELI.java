package org.swtk.commons.dict.wordnet.index.name.instance.f.e.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFELI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"felicia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11989879\"]}");
	add("{\"term\":\"felicitation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06646403\", \"07155056\"]}");
	add("{\"term\":\"felicitousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04723486\"]}");
	add("{\"term\":\"felicity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14010908\", \"04723486\"]}");
	add("{\"term\":\"felid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02123649\"]}");
	add("{\"term\":\"felidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02123344\"]}");
	add("{\"term\":\"feline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02123649\"]}");
	add("{\"term\":\"felis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02123886\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }