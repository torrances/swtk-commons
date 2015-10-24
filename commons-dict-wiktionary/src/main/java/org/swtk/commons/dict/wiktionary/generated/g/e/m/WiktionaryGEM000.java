package org.swtk.commons.dict.wiktionary.generated.g.e.m;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGEM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("gemarist", "{\"term\":\"gemarist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Gemara|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One versed in the Gemara, or adhering to its teachings\", \"priority\":1}]}, \"synonyms\":{}}");

	add("gematria", "{\"term\":\"gematria\", \"etymology\":{\"influencers\":[], \"languages\":[\"official aramaic (700-300 bce)\", \"English\", \"ancient greek (to 1453)\"], \"text\":\"Official aramaic (700-300 bce) from Ancient greek (to 1453) \u0027γεωμετρία\u0027 (geometry)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Kabbalistic method of interpreting Hebrew words, based on numerical values of letters\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1997\u0027\u0027, Thomas Pynchon, \u0027Mason \u0026amp; Dixon\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Suppose a secret force of Jesuits, receives each Day a summary of Observations made at Greenwich, and transcalculates it according to a system known to the Kabbalists of the Second Century as \u0027\u0027\u0027Gematria\u0027\u0027\u0027, whereby Messages may be extracted from lines of Text sacred and otherwise, a Knowledge preserv’d by various Custodians over the centuries, and since the Last, possess’d by Jesuit and Freemason alike\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, Thomas Pynchon, \u0027Against the Day\u0027, Vintage 2007, p. 897\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"each letter in this alphabet also has its own \u0027numerical value\u0027, what was known among ancient Jewish students of the Torah as ‘\u0027\u0027gematria\u0027\u0027’\", \"priority\":5}]}, \"synonyms\":{}}");

	add("gemeinschaft", "{\"term\":\"gemeinschaft\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\"], \"text\":\"From German \u0027gemeinschaft\u0027 (community) equivalent to {{suffix|gemein|t1\u003dcommon|schaft|t2\u003d-ship|lang\u003den}}. More at {{l|en|mean}}, {{l|en|-ship}}. Compare to English \u0027gesellschaft|gesellschaft\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An association or group of individuals sharing common beliefs, attitudes, and tastes; a fellowship\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A society or group characterized by a strong sense of common identity, personal relationships, and attachments to various concerns\", \"priority\":2}]}, \"synonyms\":{}}");

	add("gemfish", "{\"term\":\"gemfish\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|gem|fish|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A bottom-dwelling fish, of the family Gempylidae, which inhabits deep waters off of southern Australia\", \"priority\":1}]}, \"synonyms\":{}}");

	add("gemination", "{\"term\":\"gemination\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin {{m|la|geminātiō||a doubling}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A phenomenon when a consonant is pronounced for an audibly longer period of time than is done normally\", \"priority\":1}]}, \"synonyms\":{}}");

	add("gemot", "{\"term\":\"gemot\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\"], \"text\":\"From Old english (ca. 450-1100) {{m|ang|gemōt||meeting, council, moot, encounter}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A (legislative or judicial) assembly in Anglo-Saxon England\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1849\u0027\u0027, John Mitchell Kemble, \u0027The Saxons in England: A History\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"a.d. 978. — In this year was held the celebrated \u0027\u0027gemot\u0027\u0027 at Calne in Wiltshire, when the floor gave way\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1895\u0027\u0027, Geoff Horton, \u0027The Lives of the Fathers, Martyrs, and Principal Saints\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Each division had a court subordinate to those that were superior, the highest in each shire being the shire-\u0027\u0027gemot\u0027\u0027, or folck-mote\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Any assembly\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"1984\u0027\u0027, David Dvorkin, \u0027The Trellisane Confrontation\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"I have spoken to Veedron, a member of one of Trellisane\u0027s many \u0027\u0027gemots\u0027\u0027, or ruling councils\", \"priority\":8}]}, \"synonyms\":{}}");

	add("gemstone", "{\"term\":\"gemstone\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a gem, usually made of minerals\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }