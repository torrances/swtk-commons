package org.swtk.commons.dict.wordnet.index.name.instance.c.a.r.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCART {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cart\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03489166\", \"02974308\"]}");
	add("{\"term\":\"cartage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01108023\"]}");
	add("{\"term\":\"cartagena\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08751248\", \"09047954\"]}");
	add("{\"term\":\"carte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06504930\"]}");
	add("{\"term\":\"cartel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08253542\"]}");
	add("{\"term\":\"carter\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09917366\", \"10904583\", \"10904758\"]}");
	add("{\"term\":\"cartesian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09917472\"]}");
	add("{\"term\":\"carthage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08939722\"]}");
	add("{\"term\":\"carthaginian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09716466\"]}");
	add("{\"term\":\"carthamus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11966399\"]}");
	add("{\"term\":\"carthorse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02389505\"]}");
	add("{\"term\":\"carthusian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09917559\"]}");
	add("{\"term\":\"cartier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10904928\"]}");
	add("{\"term\":\"cartilage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05295590\"]}");
	add("{\"term\":\"cartilaginification\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14207408\"]}");
	add("{\"term\":\"carting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01108023\"]}");
	add("{\"term\":\"cartload\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13788392\"]}");
	add("{\"term\":\"cartographer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09917667\"]}");
	add("{\"term\":\"cartography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00926393\"]}");
	add("{\"term\":\"carton\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02974815\", \"13788477\"]}");
	add("{\"term\":\"cartonful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13788477\"]}");
	add("{\"term\":\"cartoon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06628817\", \"06793517\"]}");
	add("{\"term\":\"cartoonist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09917798\"]}");
	add("{\"term\":\"cartouch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02974932\"]}");
	add("{\"term\":\"cartouche\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02974932\"]}");
	add("{\"term\":\"cartridge\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02975399\", \"02975641\", \"03709915\", \"02975150\"]}");
	add("{\"term\":\"cartroad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04470745\"]}");
	add("{\"term\":\"cartwheel\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13413435\", \"00435597\", \"02976695\"]}");
	add("{\"term\":\"cartwright\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09918144\", \"10905104\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }