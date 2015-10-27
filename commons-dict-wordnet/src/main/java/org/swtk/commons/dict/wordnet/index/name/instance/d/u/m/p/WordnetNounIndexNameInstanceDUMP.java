package org.swtk.commons.dict.wordnet.index.name.instance.d.u.m.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDUMP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dump\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03260493\", \"06401870\", \"08577564\", \"13576978\"]}");
	add("{\"term\":\"dumpcart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03260602\"]}");
	add("{\"term\":\"dumper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03260869\"]}");
	add("{\"term\":\"dumpiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05005981\"]}");
	add("{\"term\":\"dumping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01117910\"]}");
	add("{\"term\":\"dumpling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07626757\", \"07717938\"]}");
	add("{\"term\":\"dumplings\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07717938\"]}");
	add("{\"term\":\"dumps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14428465\"]}");
	add("{\"term\":\"dumpsite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08577564\"]}");
	add("{\"term\":\"dumpster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03260735\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }