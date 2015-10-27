package org.swtk.commons.dict.wordnet.index.name.instance.l.o.c.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLOCA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"local\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03686474\", \"03686268\"]}");
	add("{\"term\":\"locale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08695366\"]}");
	add("{\"term\":\"localisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00156307\", \"06001159\"]}");
	add("{\"term\":\"localism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06212164\", \"07171083\"]}");
	add("{\"term\":\"locality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08658688\"]}");
	add("{\"term\":\"localization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06001159\", \"00156307\"]}");
	add("{\"term\":\"locater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10288627\"]}");
	add("{\"term\":\"locating\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00156307\", \"01053255\"]}");
	add("{\"term\":\"location\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03687515\", \"00156307\", \"01053255\", \"00027365\"]}");
	add("{\"term\":\"locative\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06343912\"]}");
	add("{\"term\":\"locator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10288627\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }