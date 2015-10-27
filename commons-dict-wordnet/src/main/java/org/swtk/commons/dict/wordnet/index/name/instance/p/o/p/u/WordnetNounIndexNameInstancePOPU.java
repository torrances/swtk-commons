package org.swtk.commons.dict.wordnet.index.name.instance.p.o.p.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOPU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"populace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08196607\"]}");
	add("{\"term\":\"popularisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00273921\", \"07188911\"]}");
	add("{\"term\":\"populariser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10474308\"]}");
	add("{\"term\":\"popularism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07038586\"]}");
	add("{\"term\":\"popularity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04815891\"]}");
	add("{\"term\":\"popularization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00273921\", \"07188911\"]}");
	add("{\"term\":\"popularizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10474308\"]}");
	add("{\"term\":\"population\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01260649\", \"13802016\", \"06035684\", \"08195659\", \"08196797\"]}");
	add("{\"term\":\"populism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05974800\"]}");
	add("{\"term\":\"populist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10021663\"]}");
	add("{\"term\":\"populus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12751962\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }