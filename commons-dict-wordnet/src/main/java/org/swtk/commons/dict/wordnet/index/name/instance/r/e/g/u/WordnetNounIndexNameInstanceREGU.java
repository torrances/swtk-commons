package org.swtk.commons.dict.wordnet.index.name.instance.r.e.g.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREGU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"regular\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05104234\", \"10537176\", \"10537336\", \"10536998\"]}");
	add("{\"term\":\"regularisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00808563\", \"13948048\"]}");
	add("{\"term\":\"regularity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04774586\", \"05072380\"]}");
	add("{\"term\":\"regularization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00808563\", \"13948048\"]}");
	add("{\"term\":\"regulating\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00806695\"]}");
	add("{\"term\":\"regulation\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00806695\", \"00808563\", \"13570308\", \"14466900\", \"05854581\", \"06676796\"]}");
	add("{\"term\":\"regulator\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03454962\", \"10537419\", \"04079305\"]}");
	add("{\"term\":\"regulus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01566220\", \"09429822\"]}");
	add("{\"term\":\"regur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14719658\"]}");
	add("{\"term\":\"regurgitation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00119553\", \"05770668\", \"07421074\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }