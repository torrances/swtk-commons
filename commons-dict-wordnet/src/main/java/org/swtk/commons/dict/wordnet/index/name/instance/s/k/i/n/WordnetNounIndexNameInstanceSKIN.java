package org.swtk.commons.dict.wordnet.index.name.instance.s.k.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSKIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"skin\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"04237283\", \"07754329\", \"09853256\", \"10626886\", \"13985384\", \"01898376\", \"04237155\", \"05245612\"]}");
	add("{\"term\":\"skincare\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00666922\"]}");
	add("{\"term\":\"skinflint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10377436\"]}");
	add("{\"term\":\"skinful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13791812\"]}");
	add("{\"term\":\"skinhead\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09853256\", \"10626886\"]}");
	add("{\"term\":\"skinheads\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08388127\"]}");
	add("{\"term\":\"skink\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01686774\"]}");
	add("{\"term\":\"skinner\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"10357807\", \"10627222\", \"11324456\", \"11324664\", \"11324806\"]}");
	add("{\"term\":\"skinnerian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10625016\"]}");
	add("{\"term\":\"skinniness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05008889\"]}");
	add("{\"term\":\"skinny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07233513\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }