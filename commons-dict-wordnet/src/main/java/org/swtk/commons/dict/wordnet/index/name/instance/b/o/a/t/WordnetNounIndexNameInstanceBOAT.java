package org.swtk.commons.dict.wordnet.index.name.instance.b.o.a.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBOAT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"boat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03460968\", \"02861626\"]}");
	add("{\"term\":\"boatbill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02013935\"]}");
	add("{\"term\":\"boatbuilder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09881269\"]}");
	add("{\"term\":\"boater\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09881352\", \"02862524\"]}");
	add("{\"term\":\"boathouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02862783\"]}");
	add("{\"term\":\"boating\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00316216\"]}");
	add("{\"term\":\"boatload\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13797723\"]}");
	add("{\"term\":\"boatman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09881352\"]}");
	add("{\"term\":\"boatmanship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05647786\"]}");
	add("{\"term\":\"boatswain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09881589\"]}");
	add("{\"term\":\"boatyard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02863295\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }