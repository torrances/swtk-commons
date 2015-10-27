package org.swtk.commons.dict.wordnet.index.name.instance.d.r.i.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDRIV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"drive\", \"synsetCount\":12, \"upperType\":\"NOUN\", \"ids\":[\"00568081\", \"03247416\", \"03247921\", \"14058780\", \"00308457\", \"00318420\", \"00573526\", \"04842955\", \"03249091\", \"00799906\", \"03247698\", \"00104654\"]}");
	add("{\"term\":\"drivel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05424022\", \"06624619\"]}");
	add("{\"term\":\"driveller\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10053388\", \"10054510\"]}");
	add("{\"term\":\"driver\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03248750\", \"06586649\", \"10055039\", \"10055155\", \"10054631\"]}");
	add("{\"term\":\"driveshaft\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03248934\"]}");
	add("{\"term\":\"driveway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03249091\"]}");
	add("{\"term\":\"driving\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00299323\", \"00573526\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }