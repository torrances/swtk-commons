package org.swtk.commons.dict.wordnet.index.name.instance.t.h.a.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTHAL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"thalamus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05506823\"]}");
	add("{\"term\":\"thalarctos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02136554\"]}");
	add("{\"term\":\"thalassaemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14219197\"]}");
	add("{\"term\":\"thalassemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14219197\"]}");
	add("{\"term\":\"thalassoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02611799\"]}");
	add("{\"term\":\"thales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11357326\"]}");
	add("{\"term\":\"thalia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09518980\", \"09590309\"]}");
	add("{\"term\":\"thaliacea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01471863\"]}");
	add("{\"term\":\"thalictrum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11758847\"]}");
	add("{\"term\":\"thalidomide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04424602\"]}");
	add("{\"term\":\"thalidone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03027306\"]}");
	add("{\"term\":\"thallium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14681997\"]}");
	add("{\"term\":\"thallophyta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11551908\"]}");
	add("{\"term\":\"thallophyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11552152\"]}");
	add("{\"term\":\"thallus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11552468\"]}");
	add("{\"term\":\"thalmencephalon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05504641\"]}");
	add("{\"term\":\"thalweg\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06814723\", \"13935701\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }