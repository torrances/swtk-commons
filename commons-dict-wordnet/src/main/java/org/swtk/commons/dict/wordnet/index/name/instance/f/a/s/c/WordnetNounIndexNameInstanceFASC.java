package org.swtk.commons.dict.wordnet.index.name.instance.f.a.s.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFASC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fasces\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06894848\"]}");
	add("{\"term\":\"fascia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03167888\", \"05590163\"]}");
	add("{\"term\":\"fascicle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05483333\", \"06403545\"]}");
	add("{\"term\":\"fasciculation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14386772\"]}");
	add("{\"term\":\"fascicule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06403545\"]}");
	add("{\"term\":\"fasciculus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05483333\"]}");
	add("{\"term\":\"fascination\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04696799\", \"07513215\", \"14431303\"]}");
	add("{\"term\":\"fasciola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01928888\"]}");
	add("{\"term\":\"fascioliasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14199209\"]}");
	add("{\"term\":\"fasciolidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01928731\"]}");
	add("{\"term\":\"fasciolopsiasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14199385\"]}");
	add("{\"term\":\"fasciolopsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01929190\"]}");
	add("{\"term\":\"fasciolosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14199209\"]}");
	add("{\"term\":\"fascism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06227881\"]}");
	add("{\"term\":\"fascist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10099673\"]}");
	add("{\"term\":\"fascista\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10099886\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }