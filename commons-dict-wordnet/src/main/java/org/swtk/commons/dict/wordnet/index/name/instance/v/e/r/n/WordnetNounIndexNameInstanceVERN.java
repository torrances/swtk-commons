package org.swtk.commons.dict.wordnet.index.name.instance.v.e.r.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVERN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"vernacular\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07171831\", \"07171981\"]}");
	add("{\"term\":\"vernation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08390307\"]}");
	add("{\"term\":\"verne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11383407\"]}");
	add("{\"term\":\"verner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11383547\"]}");
	add("{\"term\":\"vernier\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04536403\", \"11383652\"]}");
	add("{\"term\":\"vernix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15136992\"]}");
	add("{\"term\":\"vernonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12052396\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }