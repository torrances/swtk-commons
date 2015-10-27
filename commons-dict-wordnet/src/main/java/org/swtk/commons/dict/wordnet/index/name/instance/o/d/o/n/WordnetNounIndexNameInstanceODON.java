package org.swtk.commons.dict.wordnet.index.name.instance.o.d.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceODON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"odonata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02270627\"]}");
	add("{\"term\":\"odonate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02270800\"]}");
	add("{\"term\":\"odontalgia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14347383\"]}");
	add("{\"term\":\"odontaspididae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01489718\"]}");
	add("{\"term\":\"odontaspis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01489953\"]}");
	add("{\"term\":\"odontiasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13586984\"]}");
	add("{\"term\":\"odontoceti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02069103\"]}");
	add("{\"term\":\"odontoglossum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12094492\"]}");
	add("{\"term\":\"odontology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06056961\"]}");
	add("{\"term\":\"odontophorus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01808087\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }