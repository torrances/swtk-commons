package org.swtk.commons.dict.wiktionary.generated.t.a.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTAG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tagati", "{\"term\":\"tagati\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"The term is first recorded in 1836; it derives from the Zulu word \u0027umthakath. Zulu|umthakathi\u0027, being someone who mixes medicine, which itself comes from the Zulu \u0027thak. Zulu|thaka\u0027 (mix) and \u0027muth. Zulu|muthi\u0027 (medicine). The term has gradually come to be used to refer only to negative, harmful uses of medicines derived from plants, animals and minerals.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"In South African English, a wizard, witch, or a spiteful person who operates in secret to harm others or who uses poisons and familiar spirits to carry out harmful deeds\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tagball", "{\"term\":\"tagball\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|lang\u003den|tag|paintball}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a game/sport similar to paintball, where one tags out opponents with rubber balls fired from air pistols or paintball guns, without the mess of paint, akin to dart tag\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tagboard", "{\"term\":\"tagboard\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|tag|board|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small message board on a webpage, usually located in the sidebar, where visitors can leave a name and short message\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tagger", "{\"term\":\"tagger\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"From English \u0027tag\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who tags\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Francis Edward Abernethy, \u0027Texas Toys and Games\u0027 (page 111\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The teacher then calls on each one of the tagged to identify his \u0027\u0027tagger\u0027\u0027. If a student cannot guess correctly, he must sit down\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A person who writes graffiti using his or her tag\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A component of a parser that tags words\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A program that adds tags for purposes of categorization, e.g. to a music collection\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The penis.\u0026lt;!--in Esquire. London: The National Magazine Company Ltd, 1992--\u0026gt;\u0026lt;!--variant of \u0026quot;tadger\u0026quot;?--\u0026gt;\u0026lt;!--Definitions were gleaned from the British National Corpus http://sara.natcorp.ox.ac.uk/cgi-bin/saraWeb?qy\u003dtagger - please amend and improve--\u0026gt\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"Sheets of tin or other plate which run below the gauge\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"A device for removing taglocks from sheep\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"That which is pointed like a tag\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"Cotto\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"hedgehogs\u0027 or porcupines\u0027 small \u0027\u0027taggers\", \"priority\":12}]}, \"synonyms\":{}}");

	add("tagliatelle", "{\"term\":\"tagliatelle\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Italian\"], \"text\":\"Italian see below.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"long, flat ribbons of pasta, originally from Emilia-Romagna, sliced from a rolled-out sheet\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tagline", "{\"term\":\"tagline\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|tag|line|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The punch line of a joke\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A pithy quote habitually appended to a signature, used as an advertising slogan, etc\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A line attached to a draft of cargo or a container to provide control and minimize pendulation of cargo during lifting operations.\u0026lt;ref name\u003d\u0026quot;JP102\u0026quot;\u0026gt;\u0027\u0027Joint Publication 1-02 \u0027U.S. Department of Defense Dictionary of Military and Associated Terms; 12 April 2001 (As Amended Through 14 April 2006).\u0027\u0027\u0027\u0026lt;/ref\u0026gt\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A light rope attached to an object being hoisted by a crane, used to guide it while lifting or lowering\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }