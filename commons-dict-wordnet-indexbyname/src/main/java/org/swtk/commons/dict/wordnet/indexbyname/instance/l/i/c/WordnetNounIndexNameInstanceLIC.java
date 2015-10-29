package org.swtk.commons.dict.wordnet.indexbyname.instance.l.i.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLIC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"licence\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06561652\", \"14018291\", \"14018863\"]}");
	add("{\"term\":\"license\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01141515\", \"14018863\", \"14018291\", \"06561652\"]}");
	add("{\"term\":\"license fee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13343135\"]}");
	add("{\"term\":\"license number\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06437478\"]}");
	add("{\"term\":\"license plate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03666506\"]}");
	add("{\"term\":\"license tax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13343135\"]}");
	add("{\"term\":\"licensed practical nurse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10278001\"]}");
	add("{\"term\":\"licensee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10278190\"]}");
	add("{\"term\":\"licenser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10278299\"]}");
	add("{\"term\":\"licensing agreement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06539567\"]}");
	add("{\"term\":\"licensing fee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13343135\"]}");
	add("{\"term\":\"licentiate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10278483\"]}");
	add("{\"term\":\"licentiousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00749605\", \"04858946\"]}");
	add("{\"term\":\"lichanura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01745321\"]}");
	add("{\"term\":\"lichanura trivirgata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01745462\"]}");
	add("{\"term\":\"lichee\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07782149\", \"12765147\"]}");
	add("{\"term\":\"lichen\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13007816\", \"14252885\"]}");
	add("{\"term\":\"lichen planus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14253086\"]}");
	add("{\"term\":\"lichen ruber planus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14253086\"]}");
	add("{\"term\":\"lichenales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13007618\"]}");
	add("{\"term\":\"lichenes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13007207\"]}");
	add("{\"term\":\"lichgate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03704149\"]}");
	add("{\"term\":\"lichi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07782149\"]}");
	add("{\"term\":\"lichtenoid eczema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14249359\"]}");
	add("{\"term\":\"lichtenstein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11151648\"]}");
	add("{\"term\":\"licinius lucullus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11163590\"]}");
	add("{\"term\":\"licitness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04817446\"]}");
	add("{\"term\":\"lick\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00135600\", \"00151411\", \"09443567\"]}");
	add("{\"term\":\"licking\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01163216\", \"07490504\"]}");
	add("{\"term\":\"licorice\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07622970\", \"12553391\"]}");
	add("{\"term\":\"licorice fern\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13194030\"]}");
	add("{\"term\":\"licorice root\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12553942\"]}");
	add("{\"term\":\"licorice stick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02837232\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }