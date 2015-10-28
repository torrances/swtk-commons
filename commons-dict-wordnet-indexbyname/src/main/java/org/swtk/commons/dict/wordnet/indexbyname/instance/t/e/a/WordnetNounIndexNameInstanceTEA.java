package org.swtk.commons.dict.wordnet.indexbyname.instance.t.e.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTEA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tea\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"07949081\", \"08271662\", \"12950543\", \"07591075\", \"07949514\"]}");
	add("{\"term\":\"teaberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07759699\", \"12256282\"]}");
	add("{\"term\":\"teacake\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07650360\", \"07650510\"]}");
	add("{\"term\":\"teacart\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04404162\"]}");
	add("{\"term\":\"teach\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11353998\"]}");
	add("{\"term\":\"teacher\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05863377\", \"10713754\"]}");
	add("{\"term\":\"teachership\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00605926\"]}");
	add("{\"term\":\"teaching\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00884975\", \"06195690\", \"00888759\"]}");
	add("{\"term\":\"teacup\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04404587\", \"13792775\"]}");
	add("{\"term\":\"teacupful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13792775\"]}");
	add("{\"term\":\"teahouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04405632\"]}");
	add("{\"term\":\"teak\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12937271\", \"12937483\"]}");
	add("{\"term\":\"teakettle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04404903\"]}");
	add("{\"term\":\"teakwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12937483\"]}");
	add("{\"term\":\"teal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01850764\", \"04975603\"]}");
	add("{\"term\":\"team\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08001826\", \"08225481\"]}");
	add("{\"term\":\"teammate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10714546\"]}");
	add("{\"term\":\"teamster\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10714688\", \"10714829\"]}");
	add("{\"term\":\"teamwork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01205984\"]}");
	add("{\"term\":\"teapot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04405179\"]}");
	add("{\"term\":\"tear\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00391894\", \"00511734\", \"09433806\", \"05412667\"]}");
	add("{\"term\":\"tearaway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10714946\"]}");
	add("{\"term\":\"teardrop\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05412667\", \"13924618\"]}");
	add("{\"term\":\"tearfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07549666\"]}");
	add("{\"term\":\"teargas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15092444\"]}");
	add("{\"term\":\"tearing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13527046\"]}");
	add("{\"term\":\"tearjerker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06385771\"]}");
	add("{\"term\":\"tearoom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04405632\"]}");
	add("{\"term\":\"tears\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00869874\"]}");
	add("{\"term\":\"teasdale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11354210\"]}");
	add("{\"term\":\"tease\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00426908\", \"09984664\", \"10715051\"]}");
	add("{\"term\":\"teasel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12703172\"]}");
	add("{\"term\":\"teaser\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"04405302\", \"04463547\", \"06409288\", \"06797496\", \"07265536\", \"10715051\", \"10715318\"]}");
	add("{\"term\":\"teashop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04405632\"]}");
	add("{\"term\":\"teasing\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00257828\", \"00514852\", \"00426908\"]}");
	add("{\"term\":\"teasle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12703172\"]}");
	add("{\"term\":\"teaspoon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04405823\", \"13792869\"]}");
	add("{\"term\":\"teaspoonful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13792869\"]}");
	add("{\"term\":\"teat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05562286\"]}");
	add("{\"term\":\"teatime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07591075\"]}");
	add("{\"term\":\"teazel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12703172\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }