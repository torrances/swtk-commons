package org.swtk.commons.dict.wordnet.indexbyname.instance.d.o.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDON {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"don\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"06351765\", \"09291684\", \"09532107\", \"10045020\", \"10484108\", \"10044920\"]}");
	add("{\"term\":\"don budge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10890027\"]}");
	add("{\"term\":\"don juan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10045212\", \"10959467\"]}");
	add("{\"term\":\"don luchino visconti conte di modrone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11387576\"]}");
	add("{\"term\":\"don marquis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11178354\"]}");
	add("{\"term\":\"don quixote\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10045986\", \"09621544\"]}");
	add("{\"term\":\"don river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09291684\"]}");
	add("{\"term\":\"dona\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06351933\"]}");
	add("{\"term\":\"donald arthur glaser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11021844\"]}");
	add("{\"term\":\"donald barthelme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10856009\"]}");
	add("{\"term\":\"donald duck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02454856\"]}");
	add("{\"term\":\"donald glaser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11021844\"]}");
	add("{\"term\":\"donald robert perry marquis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11178354\"]}");
	add("{\"term\":\"donar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09608825\"]}");
	add("{\"term\":\"donatello\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10959032\"]}");
	add("{\"term\":\"donation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01091702\", \"13291061\"]}");
	add("{\"term\":\"donatism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06238217\"]}");
	add("{\"term\":\"donatist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10045116\"]}");
	add("{\"term\":\"donato bramante\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10882103\"]}");
	add("{\"term\":\"donato di betto bardi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10959032\"]}");
	add("{\"term\":\"donatus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10959179\"]}");
	add("{\"term\":\"donbas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09038602\"]}");
	add("{\"term\":\"donbass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09038602\"]}");
	add("{\"term\":\"donee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09869529\"]}");
	add("{\"term\":\"donets basin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09038602\"]}");
	add("{\"term\":\"donetsk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09038469\"]}");
	add("{\"term\":\"donetske\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09038469\"]}");
	add("{\"term\":\"dong\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13696995\"]}");
	add("{\"term\":\"dongle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03226054\"]}");
	add("{\"term\":\"donizetti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10959352\"]}");
	add("{\"term\":\"donjon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03615311\"]}");
	add("{\"term\":\"donkey\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02392211\", \"06894410\"]}");
	add("{\"term\":\"donkey boiler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02765730\"]}");
	add("{\"term\":\"donkey cart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03988282\"]}");
	add("{\"term\":\"donkey engine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02765914\", \"04380515\"]}");
	add("{\"term\":\"donkey jacket\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03226243\"]}");
	add("{\"term\":\"donkey pump\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02766088\"]}");
	add("{\"term\":\"donkeywork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00622716\"]}");
	add("{\"term\":\"donkin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10959622\"]}");
	add("{\"term\":\"donna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10045360\"]}");
	add("{\"term\":\"donne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10959848\"]}");
	add("{\"term\":\"donner pass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09291833\"]}");
	add("{\"term\":\"donor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10045783\", \"10045455\"]}");
	add("{\"term\":\"donor card\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06489316\"]}");
	add("{\"term\":\"donut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07654678\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }