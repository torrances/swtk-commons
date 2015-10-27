package org.swtk.commons.dict.wordnet.index.name.instance.b.e.a.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBEAU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"beau\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10010564\", \"09890770\"]}");
	add("{\"term\":\"beaugregory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02609381\"]}");
	add("{\"term\":\"beaujolais\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07910077\"]}");
	add("{\"term\":\"beaumont\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09165942\", \"10858925\", \"10859065\"]}");
	add("{\"term\":\"beaumontia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11791438\"]}");
	add("{\"term\":\"beaut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05934334\"]}");
	add("{\"term\":\"beauteousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04692745\"]}");
	add("{\"term\":\"beautician\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09865407\"]}");
	add("{\"term\":\"beautification\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00262447\"]}");
	add("{\"term\":\"beauty\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05934334\", \"10633512\", \"04691171\"]}");
	add("{\"term\":\"beauvoir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10859213\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }