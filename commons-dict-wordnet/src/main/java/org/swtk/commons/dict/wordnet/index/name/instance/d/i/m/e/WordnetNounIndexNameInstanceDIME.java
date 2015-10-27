package org.swtk.commons.dict.wordnet.index.name.instance.d.i.m.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDIME {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dime\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03203503\", \"13411213\"]}");
	add("{\"term\":\"dimenhydrinate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03203635\"]}");
	add("{\"term\":\"dimension\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05098398\", \"06020795\", \"05857567\", \"05100843\"]}");
	add("{\"term\":\"dimensionality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05070162\"]}");
	add("{\"term\":\"dimer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14859739\"]}");
	add("{\"term\":\"dimetane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02908747\"]}");
	add("{\"term\":\"dimetapp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03203826\"]}");
	add("{\"term\":\"dimethylglyoxime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14859856\"]}");
	add("{\"term\":\"dimetrodon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01725311\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }