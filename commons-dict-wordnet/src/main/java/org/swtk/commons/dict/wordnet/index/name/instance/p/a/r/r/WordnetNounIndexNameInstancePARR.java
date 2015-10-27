package org.swtk.commons.dict.wordnet.index.name.instance.p.a.r.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePARR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"parr\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02516358\", \"02537711\", \"11244036\"]}");
	add("{\"term\":\"parrakeet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01823844\"]}");
	add("{\"term\":\"parricide\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00222463\", \"10420903\"]}");
	add("{\"term\":\"parrish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11244163\"]}");
	add("{\"term\":\"parroket\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01823844\"]}");
	add("{\"term\":\"parroquet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01823844\"]}");
	add("{\"term\":\"parrot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10421030\", \"01819528\"]}");
	add("{\"term\":\"parrotfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02613294\"]}");
	add("{\"term\":\"parrotia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12337681\"]}");
	add("{\"term\":\"parrotiopsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12338128\"]}");
	add("{\"term\":\"parry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00136324\", \"01176985\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }