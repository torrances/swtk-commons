package org.swtk.commons.dict.wiktionary.generated.z.e.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryZEB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("zebra", "{\"term\":\"zebra\", \"etymology\":{\"influencers\":[{},{},{},{},{}], \"languages\":[\"English\", \"Italian\", \"Latin\", \"Portuguese\"], \"text\":\"1600; from Italian \u0027zebra\u0027 from Portuguese \u0027zebra\u0027 \u0027zebro\u0027 (zebra) from Old Portuguese \u0027enzebro\u0027 \u0027ezebra\u0027 \u0027azebra\u0027 (wild ass) from earlier \u0027cebrario\u0027 (882), \u0027ezebrario\u0027 (897), from {{m|la|*eciferus}}, from Latin \u0027equiferus\u0027 (wild horse) (Pliny), from \u0027equus\u0027 (horse) + \u0027ferus\u0027 (wild) {{sense|biracial person}} The term \u0027\u0027\u0027zebra\u0027\u0027\u0027, as used in its pejorative sense, was popularized on the television situation comedy \u0027{{w|The Jeffersons}}\u0027. The term was used by the series protagonist, George Jefferson (Sherman Hemsley), to express disdain for his daughter-in-law, Jenny Willis Jefferson, whose father was white and mother was black.While the word was traditionally pronounced with a long initial vowel in standard English, during the twentieth century a vowel shift occurred in regions of England, with the adoption of an initial short vowel.\u0026lt;ref\u0026gt;{{cite journal|last\u003dWells|first\u003dJohn|title\u003dOur changing pronunciation|journal\u003dTransactions of the Yorkshire Dialect Society|date\u003d1997|pages\u003dxix.42-48|url\u003dhttp://www.phon.ucl.ac.uk/home/wells/yorksdial-uni.htm|accessdate\u003d6 February 2014}}\u0026lt;/ref\u0026gt; This pronunciation is now used throughout the UK and Commonwealth. The long vowel pronunciation remains standard in American English.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of three species of genus \u0027Equus\u0027: \u0027Equus E. grevyi\u0027, \u0027Equus E. quagga\u0027, or \u0027Equus E. zebra\u0027, all with black and white stripes and native to Africa\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A referee\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"An unlikely diagnosis, especially for symptoms probably caused by a common ailment. (Originates in the advice often given to medical students: \u0026quot;When you hear hoof beats, think of horses, not zebras.\u0026quot\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A bi-racial person, specifically one born to a member of the Sub-Saharan African race and a Caucasian\", \"priority\":4}]}, \"synonyms\":{}}");

	add("zebrafish", "{\"term\":\"zebrafish\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|zebra|fish|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small striped fish, \u0027Danio rerio\u0027, originally from India but now common as an aquarium fish and as a subject of genetic experiments\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2002\u0027\u0027 Lilianna Solnica-Krezel - Pattern Formation in Zebrafis\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Use of the GAL4-UAS technique for targeted gene expression in the \u0027\u0027zebrafish\", \"priority\":3}]}, \"synonyms\":{}}");

	add("zebrawood", "{\"term\":\"zebrawood\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|zebra|wood|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any wood with a figure (grain pattern) like the striping of a zebra, most often wood of the genus\", \"priority\":1}]}, \"synonyms\":{}}");

	add("zebrinny", "{\"term\":\"zebrinny\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|zebra|hinny|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The offspring of a male horse and a female zebra\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1900\u0027\u0027, \u0027The Annual Register of World Events\u0027 (volume 141, page 113\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"His zebra-horse hybrids, or zebrules, and his horse-zebra hybrids, or \u0027\u0027zebrinnies\u0027\u0027, are not marked like their Burchell-zebra parent, but resemble in both cases the Somali zebra, which is the most primitive of all its kind\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1955\u0027\u0027, Ivan Terence Sanderson, \u0027Living mammals of the world\u0027 (page 223\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"They will also interbreed with horses, producing zebrules (Plate 137) or \u0027\u0027zebrinnies\", \"priority\":5}]}, \"synonyms\":{}}");

	add("zebrule", "{\"term\":\"zebrule\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|zebra|mule|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A cross between a male zebra and a female horse\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }