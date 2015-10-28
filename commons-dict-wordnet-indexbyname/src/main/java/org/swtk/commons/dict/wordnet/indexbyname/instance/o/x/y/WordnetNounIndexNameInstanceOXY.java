package org.swtk.commons.dict.wordnet.indexbyname.instance.o.x.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOXY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"oxyacetylene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14996743\"]}");
	add("{\"term\":\"oxyacid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14996918\"]}");
	add("{\"term\":\"oxybelis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01741901\"]}");
	add("{\"term\":\"oxybenzene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14820243\"]}");
	add("{\"term\":\"oxycephaly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14187672\"]}");
	add("{\"term\":\"oxydendrum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12262804\"]}");
	add("{\"term\":\"oxygen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14672278\"]}");
	add("{\"term\":\"oxygenase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14997240\"]}");
	add("{\"term\":\"oxygenation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13552352\"]}");
	add("{\"term\":\"oxyhaemoglobin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15049340\"]}");
	add("{\"term\":\"oxyhemoglobin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15049340\"]}");
	add("{\"term\":\"oxylebius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02651712\"]}");
	add("{\"term\":\"oxymoron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07122695\"]}");
	add("{\"term\":\"oxyopia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05663811\"]}");
	add("{\"term\":\"oxyphenbutazone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03874722\"]}");
	add("{\"term\":\"oxyphencyclimine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03874900\"]}");
	add("{\"term\":\"oxytetracycline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03875067\"]}");
	add("{\"term\":\"oxytocic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03875363\"]}");
	add("{\"term\":\"oxytocin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05418914\"]}");
	add("{\"term\":\"oxytone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06305497\"]}");
	add("{\"term\":\"oxytropis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12574747\"]}");
	add("{\"term\":\"oxyura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01852388\"]}");
	add("{\"term\":\"oxyuranus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01753994\"]}");
	add("{\"term\":\"oxyuridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01933918\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }