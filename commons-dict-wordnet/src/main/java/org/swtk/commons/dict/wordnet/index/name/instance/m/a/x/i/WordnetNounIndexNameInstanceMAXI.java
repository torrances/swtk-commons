package org.swtk.commons.dict.wordnet.index.name.instance.m.a.x.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMAXI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"maxi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03737949\"]}");
	add("{\"term\":\"maxilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05291631\"]}");
	add("{\"term\":\"maxillaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12093718\"]}");
	add("{\"term\":\"maxillary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05291631\"]}");
	add("{\"term\":\"maxim\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11186050\", \"07167656\"]}");
	add("{\"term\":\"maximation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00367892\"]}");
	add("{\"term\":\"maximian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11186241\"]}");
	add("{\"term\":\"maximisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00367892\"]}");
	add("{\"term\":\"maximization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00367892\", \"00872464\"]}");
	add("{\"term\":\"maximum\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08615688\", \"05132193\", \"13798337\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }