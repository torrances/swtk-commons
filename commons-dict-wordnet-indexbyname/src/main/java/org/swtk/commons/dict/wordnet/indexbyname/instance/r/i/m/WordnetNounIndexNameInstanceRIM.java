package org.swtk.commons.dict.wordnet.indexbyname.instance.r.i.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRIM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rim\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02905554\", \"03361704\", \"04099417\", \"04099559\", \"13925029\"]}");
	add("{\"term\":\"rim blight\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14242119\"]}");
	add("{\"term\":\"rima\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05617763\"]}");
	add("{\"term\":\"rima glottidis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05617953\"]}");
	add("{\"term\":\"rima oris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05309998\"]}");
	add("{\"term\":\"rima pudendi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05530435\"]}");
	add("{\"term\":\"rima respiratoria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05618120\"]}");
	add("{\"term\":\"rima vestibuli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05618120\"]}");
	add("{\"term\":\"rima vocalis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05617953\"]}");
	add("{\"term\":\"rima vulvae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05530435\"]}");
	add("{\"term\":\"rimactane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04097176\"]}");
	add("{\"term\":\"rimbaud\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11282755\"]}");
	add("{\"term\":\"rime\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07111327\", \"14939773\"]}");
	add("{\"term\":\"rimu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11674744\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }